class Canvas{
        public static void main(String[] args){
                List<Point> points = new ArrayList<Point>();
                points.add(new  Point(1,2));
                points.add(new Point(6,5));
                points.add(new Point(5,4));
                Collections.sort(points, new Comparator<Point>();
                //compare();
        }
        public int compare(Point o1, Point o2){
                return Integer.compare(o1.getX(), o2.getx());
        }
};
