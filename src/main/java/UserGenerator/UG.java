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
            String[] lastName ={"Charles", "Mccall", "Foster",
                    "OSullivan", "Dunlap", "Mack",
                    "Andrews", "Bloggs", "Nichols",
                    "Summers", "Wilkinson", "Hull",
                    "Stokes", "Ramirez", "Hodges",
                    "Klein", "Singleton", "Ayers"};
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
            return genName().toLowerCase();
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
            String[] job = {"Recreation & Fitness Worker", "Civil Engineer", "College Professor",
                    "Actuary", "Economist", "Fitness Trainer", "Construction Manager",
                    "Computer Hardware Engineer", "Food Scientist", "Systems Analyst"};
            int in = (int) (random() * job.length);
            return job[in];
        }

        public static String genPassword(){
            String[] password = {"Qq-123456!", "Ww-654321!", "Ee-632782!", "123456-uU!", "654321-xX!"};
            int in = (int) (random() * password.length);
            return password[in];
        }

        public static int genSalary(){
            int[] salary = {20000, 50000, 70000, 140000,
                    170000, 250000, 280000, 400000};
            int in = (int) (random() * salary.length);
            return salary[in];
        }

        public static String genDepartment(){
            String[] department = {"education", "medicine", "jurisprudence", "it", "sales", ""};
            int in = (int) (random() * department.length);
            return department[in];
        }
}
