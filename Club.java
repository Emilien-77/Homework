package modles;

public class Club {

    // Constructor ( parametri)
    String name;
    Integer age;
    Integer members;

    // Constructor fara parametri

    public Club() {
        this.name = " Necunoscut";
        this.age = 50;
        this.members = 25;
    }



        // Constructor cu parametri

     public Club(String name, Integer age, Integer members) {

    this.name = name;
        this.age = age;
        this.members = members;

}


        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public Integer getAge () {
            return age;
        }

        public void setAge (Integer age){
            this.age = age;
        }

        public Integer getMembers () {
            return members;
        }

        public void setMembers (Integer members) {
            this.members = members;
        }

             // metoda 1
            public void exist() {
                System.out.println(name + " is existing ");
            }

                // metoda 2
                 public void have() {
                    System.out.println(name + " is having 50 members"  );
        }

    }