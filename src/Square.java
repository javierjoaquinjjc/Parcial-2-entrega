public class Square extends Rectangulo {
        private double side;
        public double getSide() {
            return side;
        }
        public void setSide(double side) {
            this.side = side;
        }
        public void setWidth(double side) {
            this.width = side;
        }

        public void setLength(double side) {
            this.length = side;
        }
        public String toString (){
            return String.format("%d %s ",getColor(), getFilled(),"%a %x ",getWidth(),getLength());
        }
        Square(){

        }
        Square(double side){
            super();

            this.setSide(side);
        }
        Square(double side , String color,boolean filled){
            super();

            this.setSide(side);
            this.setColor(color);
            this.setFilled(filled);
        }
    }

