public class Rectangle
{
    private int length, width;
        Rectangle()
        {

        }
        Rectangle(int a)
        {
            length = a; width = a;
        }
        Rectangle(Rectangle obj)
        {
            if((obj.length >= 0)&(obj.width>=0))
            {
                this.length = obj.length;
                this.width = obj.width;
            }
            else
            {
                System.out.println("Can't Initialize Data members with negative Value");
            }
        }
        Rectangle(int a, int b)
        {
            length = a; width = b;
        }
        public boolean equals(Rectangle obj)
        {
            if ((this.length == obj.length)&(this.width == obj.width)) {
                return true;
            }
            return false;
        }
        public void setLength(int a)
        {
            length = a;
        }
        public void setwidth(int a)
        {
            width = a;
        }
        public int getLength()
        {
            return length;
        }

        public int getwidth()
        {
            return width;
        }
        public void display()
        {
            System.out.println("Length of Rectangle: "+length);
            System.out.println("width of Rectangle: "+width);
        }
        public int calculateArea()
        {
            return length*width;
        }
        public boolean checkSquare()
        {
            if (length == width) {
                return true;
            }
            return false;
        }
        public Rectangle compareArea(Rectangle object)
        {
            if (this.calculateArea() > object.calculateArea()) {
                return this;
            }
            return object;
        }
}