package Application;

import model.dao.DepartamentoDao;
import model.dao.FabricaDao;
import model.entities.Departamento;

import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartamentoDao departamentoDao = FabricaDao.createDepartamentoDao();

        /*System.out.println();
        System.out.println("=== TEST 1: delete departamento ===");
        System.out.println("insira o id para teste de exclusão");
        int id = sc.nextInt();
        departamentoDao.deleteById(id);
        System.out.println("exclusao concluida!");

        System.out.println();
        System.out.println("=== TEST 2: findById departamento ===");
        Departamento departamento = departamentoDao.findById(1);
        System.out.println(departamento);*/

        System.out.println();
        System.out.println("=== TEST 3: update departamento ===");
        Departamento departamento = departamentoDao.findById(7);
        departamento.setNome("Fitness");
        departamentoDao.updade(departamento);
        System.out.println("Update concluido!");
    }
}
