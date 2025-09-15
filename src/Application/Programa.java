package Application;

import model.dao.FabricaDao;
import model.dao.VendedorDao;
import model.entities.Departamento;
import model.entities.Vendedor;

import java.util.Date;
import java.util.List;


public class Programa {
    public static void main(String[] args) {

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
    }
}
