package org.example;

import org.example.Entity.Employee;
import org.example.Util.UtilEntity;

import javax.persistence.EntityManager;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManager em = UtilEntity.getEntityManager();
        List<Employee> employees = em.createQuery("SELECT e from Employee e",Employee.class).getResultList();
        System.out.println("Listar todos");
        employees.forEach(System.out::println);

        //Buscar
        /*
        System.out.println("Buscar uno");
        int employeId = 3;
        Employee employee = em.find(Employee.class, employeId);
        System.out.println("Empleado encontrado" + employee);
         */

        //Agregar
        /*
        System.out.println("Agregar");
        Employee newEmploye = new Employee();
        newEmploye.setFirstName("Natalia");
        newEmploye.setPaSurname("Jimenez");
        newEmploye.setMaSurname("Prieto");
        newEmploye.setEmail("nata@gmail.com");
        newEmploye.setSalary(200000.0);

        em.getTransaction().begin();
        em.persist(newEmploye);
        em.getTransaction().commit();

        System.out.println("Empleado agregado: " + newEmploye);
         */

        //Actualizar
        /*
        int emplloyeeUpdate = 2;
        Employee employeActu = em.find(Employee.class, emplloyeeUpdate);
        System.out.println("Empleado a modificar" + emplloyeeUpdate);
        employeActu.setFirstName("Carlos");
        employeActu.setEmail("carlos@gmail.com");

        em.getTransaction().begin();
        em.merge(employeActu);
        em.getTransaction().commit();

        System.out.println("Empleado actualziado" + employeActu);

         */

        //Eliminar
        /*
        System.out.println("Eliminar empleado");
        int employeeDelete = 11;
        Employee employeEliminar = em.find(Employee.class, employeeDelete);
        System.out.println("Empleado a eliminar" + employeEliminar);

        em.getTransaction().begin();
        em.remove(employeEliminar);
        em.getTransaction().commit();
        em.close();
         */

    }
}