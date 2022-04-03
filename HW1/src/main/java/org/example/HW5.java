package org.example;

public class HW5 {
   public static void main (String[]args){
        Employe employe1 = new Employe();
        employe1.getInfo();
        System.out.println();
        Employe[] employesArray = new Employe[5];
        employesArray[0] = new Employe("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312311", 70000, 50);
        employesArray[1] = new Employe("Petrov Petr", "CEO", "pepetr@mailbox.com", "892312312", 300000, 35);
        employesArray[2] = new Employe("Sidorov Ivan", "CFO", "siivan@mailbox.com", "892312313", 200000, 41);
        employesArray[3] = new Employe("Vasilev Andrey", "CIO", "vaandrey@mailbox.com", "892312314", 200000, 30);
        employesArray[4] = new Employe("Sakharov Andrey", "Engineer", "saandrey@mailbox.com", "892312315", 100000, 55);

        for(int i=0; i<employesArray.length; i++){

             if(employesArray[i].getAge()>40){
                  System.out.println("\n-----------");
                  System.out.print("Employe age > 40:");
                  employesArray[i].getInfo();

             }
        }
   }

}
