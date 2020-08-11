package com.company;

    public abstract class Plane {
        private int length;
        private int height;
        private int weight;

        public Plane (int length, int height, int weight){
            this.height = height;
            this.length = length;
            this.weight = weight;
        }


        public void Begin(){
            int begin = 20 + (int)(Math.random()*88);
            System.out.println( " The plane has turn on engines, the time left: " + begin + " minutes");
        }

        public void TakeOff(){
            double distance = (Math.random()*1000);
            System.out.println( " The plane can flight " + distance + " km with full tank ");
        }

        public void Landing (){
            System.out.println( " The plane is landing ");
        }


    }
