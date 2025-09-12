package model.dao;

import model.entities.Departamento;

import java.util.List;

public interface DepartamentoDao {

    void insert(Departamento obj);
    void updade(Departamento obj);
    void deleteById(Integer id);
    Departamento findById(Integer id);

    List<Departamento> findAll();

}
