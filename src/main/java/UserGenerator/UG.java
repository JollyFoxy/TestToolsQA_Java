package UserGenerator;

import java.util.UUID;

import static java.lang.Math.random;

/**Генирация пользователя*/
public class UG {
        public static String genName(){
            String[] name = {"Kristen", "Claire", "Lea",
                    "Ines", "Frances", "Kobi",
                    "Keelan", "Mattie", "Ollie",
                    "Sasha", "Nevaeh", "Pearl",
                    "Jaydon", "Hayden", "Cory",
                    "Kaden", "Harri", "Regan"};
            int in = (int) (random() * name.length);
            return name[in];
        }

        public static String genLastName(){
            String[] lastName ={"Charles","Mccall", "Foster",
                    "OSullivan","Dunlap","Mack",
                    "Andrews","Bloggs","Nichols",
                    "Summers","Wilkinson","Hull",
                    "Stokes","Ramirez","Hodges",
                    "Klein","Singleton","Ayers"};
            int in = (int) (random() * lastName.length);
            return lastName[in];
        }

        public static String genStreet(){
            String[] street = {"33 Carpenter Street","8798 Magnolia Road",
                    "15 North Del Monte St", "9280 Wild Horse Lane",
                    "973 N. School Dr", "35 Alderwood Dr"};
            int in = (int) (random() * street.length);
            return street[in];
        }

        public static String genUserName(){
            return new StringBuilder(genName().toLowerCase()).reverse().toString();
        }

        public static int genAge(){
            return (int) (random()*130);
        }

        public static UUID genId(){
            return UUID.randomUUID();
        }


        public static String genPhone(){
            String num1 = Integer.toString(100+(int) (random()*899));
            String num2 = Integer.toString(100+(int) (random()*899));
            String num3 = Integer.toString(100+(int) (random()*8999));

            return ("8"+num1+num2+num3);
        }

        public static String genEmail(){
            return genName().toLowerCase()+genLastName().toLowerCase()+"@mail.ru";
        }

        public static String genJob(){
            String[] job = {"Recreation & Fitness Worker","Civil Engineer","College Professor",
                    "Actuary", "Economist","Fitness Trainer","Construction Manager",
                    "Computer Hardware Engineer", "Food Scientist","Systems Analyst"};
            int in = (int) (random() * job.length);
            return job[in];
        }
}
