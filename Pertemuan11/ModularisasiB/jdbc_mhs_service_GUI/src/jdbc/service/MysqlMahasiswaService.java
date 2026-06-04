package jdbc.service;

import java.sql.*;
import java.util.*;
import jdbc.model.*;
import jdbc.utilities.*;

public class MysqlMahasiswaService {
    Connection koneksi = null;
    
    //kontruktor
    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }
    
    //Membuat objek mahasiswa 
    public Mahasiswa makeMhsObject(ResultSet rs) throws SQLException {
        Mahasiswa mhs = new Mahasiswa(rs.getInt("id"), rs.getString("nama"));
        return mhs;
    }
    
    //Menambahkan data mahasiswa
    public void add(Mahasiswa mhs) {
        String query = "INSERT INTO mahasiswa(nama) VALUES (?)";
        PreparedStatement ps = null;
        try {
            ps = koneksi.prepareStatement(query);
            ps.setString(1, mhs.getNama());
            ps.executeUpdate();
            System.out.println("Berhasil insert");
        } catch (SQLException sqle) {
            System.out.println("Gagal insert : " + sqle.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException sqle) {
                    System.out.println("Gagal menutup statement : " + sqle.getMessage());
                }
            }
        }
    }
    
    //Update data mahasiswa
    public void update(Mahasiswa mhs) {
        String query = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        PreparedStatement ps = null;
        
        try {
            ps = koneksi.prepareStatement(query);
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            ps.executeUpdate();
            System.out.println("Berhasil update");
        } catch (SQLException sqle) {
            System.out.println("Gagal update : " + sqle.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException sqle) {
                    System.out.println("Gagal menutup statement : " + sqle.getMessage());
                }
            }
        }
    }
    
    //Delete data mahasiswa sesuai id 
    public void delete(int id) {
        String query = "DELETE FROM mahasiswa WHERE id = ?";
        PreparedStatement ps = null;
        
        try {
            ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Berhasil delete");
        } catch (SQLException sqle) {
            System.out.println("Gagal delete : " + sqle.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException sqle) {
                    System.out.println("Gagal menutup statement : " + sqle.getMessage());
                }
            }
        }
    }
    
    //Ambil mahasiswa sesuai id
    public Mahasiswa getById(int id) {
        String query = "SELECT * FROM mahasiswa WHERE id = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        Mahasiswa mhs = null;
        
        try {
            ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                mhs = makeMhsObject(rs);
            }
        } catch (SQLException sqle) {
            System.out.println("Gagal mengambil data : " + sqle.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqle) {
                    System.out.println("Gagal menutup result set : " + sqle.getMessage());
                }
            }
            
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException sqle) {
                    System.out.println("Gagal menutup statement : " + sqle.getMessage());
                }
            }
        }
        
        return mhs;
    }
    
    //Ambil semua isi tabel mahasiswa 
    public List<Mahasiswa> getAll() {
        String query = "SELECT * FROM mahasiswa";
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Mahasiswa> listmhs = new ArrayList<>();
        
        try {
            ps = koneksi.prepareStatement(query);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                Mahasiswa mhs = makeMhsObject(rs);
                listmhs.add(mhs);
            }
        } catch (SQLException sqle) {
            System.out.println("Gagal mengambil data : " + sqle.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqle) {
                    System.out.println("Gagal menutup result set : " + sqle.getMessage());
                }
            }
            
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException sqle) {
                    System.out.println("Gagal menutup statement : " + sqle.getMessage());
                }
            }
        }
        
        return listmhs;
    }
    public void indexReset() {
        String query = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
        Statement st = null;

        try {
            st = koneksi.createStatement();
            st.executeUpdate(query);
            System.out.println("Index berhasil direset");
        } catch (SQLException sqle) {
            System.out.println("Gagal reset index : " + sqle.getMessage());
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException sqle) {
                    System.out.println("Gagal menutup statement : " + sqle.getMessage());
                }
            }
        }
    }
}