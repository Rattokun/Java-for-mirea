package pr1.first.task.pr1;

public class Ball {
        private String color; //
        private String material; //
        private String typeOfSport;
        private boolean inAir; //

        public Ball(String c, String m, String t, boolean a)
        {
            color = c;
            material = m;
            typeOfSport = t;
            inAir = a;
        }

        public void setColor(String color) //Установить имя книге
        {
            this.color = color;
        }
        public String getColor() { //Получить имя книги
            return color;
        }

        public void setMaterial(String material) //Установить жанр книге
        {
            this.material = material;
        }
        public String getMaterial() { //Получить жанр книги
            return material;
        }

        public void setTypeOfSport(String typeOfSport) //Установить жанр книге
        {
            this.typeOfSport = typeOfSport;
        }
        public String getTypeOfSport() { //Получить жанр книги
            return typeOfSport;
        }

        public void setInAir(boolean inAir) //Установить наличие книги
        {
            this.inAir = inAir;
        }
        public boolean getInAir()
        {
            return inAir;
        }

        public String toString()
        {
            boolean curInAir = getInAir();
            if (curInAir == true)
            {
                return this.color+" ball now in air, can't see it";
            }
            else
            {
                return this.color+" ball is on the floor, material is - "+this.material+" is very good for "+this.typeOfSport;
            }
        }
    }


