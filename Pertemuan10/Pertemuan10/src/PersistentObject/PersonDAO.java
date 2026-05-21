//File : PersonDAO.java
//Deskripsi : interface untuk person access objct

package PersistentObject;

public interface PersonDAO {
    public void savePerson(Person p) throws Exception;
}