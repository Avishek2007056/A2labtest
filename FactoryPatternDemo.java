public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory x1 = ShapeFactory.getInstance();
        ShapeFactory x2 = ShapeFactory.getInstance();
        Shape shape1 = x1.getShape("SQUARE");shape1.draw();
        Shape shape2 = x2.getShape("RECTANGLE");shape2.draw();
        System.out.println("hashcode of shape1: " + x1.hashCode());
        System.out.println("hashcode of shape2: " + x2.hashCode());
    }
}
