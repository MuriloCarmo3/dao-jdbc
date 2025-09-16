package model.dao.impl;

import db.DB;
import db.DbException;
import db.DbIntegrityException;
import model.dao.DepartamentoDao;
import model.entities.Departamento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DepartamentoDaoJDBC implements DepartamentoDao {

    private Connection conn;

    public DepartamentoDaoJDBC(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insert(Departamento obj) {

    }

    @Override
    public void updade(Departamento obj) {

        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("UPDATE department SET Id ?, Name ? ");
            st.setInt(1,obj.getId());
            st.setString(2,obj.getNome());

            st.executeUpdate();
        }
        catch (SQLException e){
            throw new DbIntegrityException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Departamento findById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement("SELECT * FROM department WHERE Id = ? ");
            st.setInt(1,id);
            rs = st.executeQuery();

            if (rs.next()){
                Departamento obj = new Departamento();
                obj.setId(rs.getInt("Id"));
                obj.setNome(rs.getString("Name"));
                return obj;
            }
            return null;
        }
        catch (SQLException e){
            throw new DbIntegrityException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    @Override
    public List<Departamento> findAll() {
        return List.of();
    }
}
