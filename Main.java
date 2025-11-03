

import modles.Club;

public class Main {
    public static void main(String[] args) {

        //  Obiect creat cu constructor fara parametri


        Club club1 = new Club();
        club1.setName(" zimbru ");
        club1.setMembers(50);
        club1.setAge(50);

        // obiect 2 creat cu constructorul cu parametri

        Club club2 = new Club("Manchester", 35, 50);

        //Afisam informatia despre fiecare club
        System.out.println(" Clubul 1 ");
        System.out.println("Nume : " + club1.getName());
        System.out.println("Members : " + club1.getMembers());
        System.out.println("Age : " + club1.getAge());
        club1.exist();
        club1.have();

        System.out.println(" Clubul 2 ");
        System.out.println("Nume : " + club2.getName());
        System.out.println("Members : " + club2.getMembers());
        System.out.println("Age : " + club2.getAge());
        club2.exist();
        club2.have();

    }

}