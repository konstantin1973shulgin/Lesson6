package animais;

 class Animal {


        public String name;
        public int run;

        public Animal() {
        }

        public Animal(String name) {
            this.name = name;
        }

        public void animalInfo() {
            System.out.println();

        }
    }

    class Cat extends Animal {

        protected boolean sweem;



        public Cat(String name, int run, boolean sweem) {
            this.name = name;
            this.run = run;
            this.sweem = sweem;

        }

        public void catInfo() {
            System.out.println("Cat: " + name + " пробежал: " + run+ " метров," + " проплыл:" + sweem + "  метров");
        }
    }

    class Dog extends Animal {

        public int sweem;


        public Dog(String name, int run, int sweem) {
            this.name = name;
            this.run = run;
            this.sweem = sweem;
        }
        public void dogInfo() {
            System.out.println("Dog: " + name  + " пробежал: " + run+ " метров," + " проплыл:" + sweem + "  метров");
        }
    }

