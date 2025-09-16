package Application;

import model.dao.DepartamentoDao;
import model.dao.FabricaDao;

import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartamentoDao departamentoDao = FabricaDao.createDepartamentoDao();

        System.out.println();
        System.out.println("=== TEST 1: delete departamento ===");
        System.out.println("insira o id para teste de exclusão");
        int id = sc.nextInt();
        departamentoDao.deleteById(id);
        System.out.println("exclusao concluida!");
    }
}
