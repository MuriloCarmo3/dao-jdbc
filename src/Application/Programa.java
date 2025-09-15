package Application;

import model.dao.FabricaDao;
import model.dao.VendedorDao;
import model.entities.Departamento;
import model.entities.Vendedor;

import java.util.Date;


public class Programa {
    public static void main(String[] args) {

        VendedorDao vendedorDao = FabricaDao.createVendedorDao();

        System.out.println("=== TEST 1: findById vendedor ===");
        Vendedor vendedor = vendedorDao.findById(3);

        System.out.println(vendedor);
    }
}
