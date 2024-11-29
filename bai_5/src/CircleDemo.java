public class CircleDemo {

    public static class Circle {
        private double radius = 1.0;
        private String color = "red";

        public Circle() {
        }

        public Circle(double radius) {
            if (radius < 0) {
                throw new IllegalArgumentException("Bán kính không được âm.");
            }
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
    }
}
