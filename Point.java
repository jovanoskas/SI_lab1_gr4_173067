
class Point {
        String id
        double x,y;

        //TODO add new variable
        String s = "red";
        //TODO constructor
	Point(String id, double x, double y, String s){
                this.id = id;
                this.x = x;
                this.y = y;
                this.s = s;
        }
        //TODO setters and getters
	String getID(){ return id;}
        double getX(){ return x;}
        double getT() { return y; }
        String getS() { return s; }

        String void setID(String id){ this.id = id; }
        double void setX(double x){ this.x = x;}
        double void setY(double y){this.y = y;}
        String void setS(String s){this.s = s; }
        public void move (char xDirection, char yDirection) {
                //TODO
		if(char XDirection == 'L'){ setX() = getX() -1;}
                if(char xDirecetion == 'D') {setX() = getX() +1;}
                if(char yDirection == 'L'){setY() = getY() -1;}
                if(char yDirection == 'D'){setY() = getY() +1;}
        }

        public void draw () {
                //TODO
		if(getX() > 0 && getY() > 0) { System.out.println("I kvadrant");
                if(getX() < 0 && getY() > 0) { System.out.println("II kvadrant");
                if(getX() < 0 && getY() < 0) { System.out.println("III kvadrant");
                if(getX() > 0 && getY() < 0) { System.out.println("IV kvadrant");
        }
}
