package com.railworld;

import com.railworld.Model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DbConnection");
        EntityManager em = emf.createEntityManager();

        // To insert the User
        User user = new User();
        user.setName("Yogesh");
        user.setEmail("yogesh@gmail.com");

        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();

        // To Update the user
        User foundUser = em.find(User.class, user.getId());
        System.out.println("User found: " + foundUser.getName() + " " + foundUser.getId());

        em.getTransaction().begin();
        foundUser.setName("Yogesh Kumar");
        em.getTransaction().commit();
        System.out.println("Updated User Name: " + foundUser.getName());

        // To Delete the User
        em.getTransaction().begin();
        em.remove(foundUser);
        em.getTransaction().commit();
        System.out.println("User Deleted");

        em.close();
        emf.close();

    }
}