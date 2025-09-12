package Application;

import model.dao.FabricaDao;
import model.dao.VendedorDao;
import model.entities.Departamento;
import model.entities.Vendedor;

import java.util.Date;


public class Programa {
    public static void main(String[] args) {

        Departamento obj = new Departamento("livros", 1);

        Vendedor vendedor = new Vendedor(21, "Joao", "JoaoH@gmail.com", new Date(), 3000.00, obj);

        VendedorDao vendedorDao = FabricaDao.createVendedorDao();

        System.out.println(vendedor);
    }
}
