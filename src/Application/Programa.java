package Application;

import model.dao.FabricaDao;
import model.dao.VendedorDao;
import model.entities.Departamento;
import model.entities.Vendedor;

import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        VendedorDao vendedorDao = FabricaDao.createVendedorDao();

        System.out.println("=== TEST 1: findById vendedor ===");
        Vendedor vendedor = vendedorDao.findById(3);
        System.out.println(vendedor);

        System.out.println();
        System.out.println("=== TEST 2: findByDepartment vendedor ===");
        Departamento departamento = new Departamento(null, 2);
        List<Vendedor> list = vendedorDao.findByDepartment(departamento);

        for (Vendedor obj : list){
            System.out.println(obj);
        }

        System.out.println();
        System.out.println("=== TEST 3: findAll vendedor ===");
        list = vendedorDao.findAll();

        for (Vendedor obj : list){
            System.out.println(obj);
        }

        System.out.println();
        System.out.println("=== TEST 4: insert vendedor ===");
        Vendedor novoVendedor = new Vendedor(null, "Neymar",  "Ney10@Gmail.com", new Date(), 4000.00, departamento);
        vendedorDao.insert(novoVendedor);
        System.out.println("Inserido! Novo id = " + novoVendedor.getId());

        System.out.println();
        System.out.println("=== TEST 5: update vendedor ===");
        vendedor = vendedorDao.findById(1);
        vendedor.setNome("Maria Sale");
        vendedorDao.updade(vendedor);
        System.out.println("Update completo");

        System.out.println();
        System.out.println("=== TEST 6: delete vendedor ===");
        System.out.println("insira o id para teste de exclusão");
        int id = sc.nextInt();
        vendedorDao.deleteById(id);
        System.out.println("exclusão concluída!");
    }
}
