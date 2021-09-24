package Com.Bridgelabz;

public class EmployeeUc1 {
    public void EmployeePresentorAbesnt() {
        int check = (int) (Math.random() * 2);
        System.out.println("\n\n Check the employee present or absent:");

        if (check == 1)
            System.out.println("\nemployee is present today");
        else
            System.out.println("\nemployee is absent today");
    }
        public static void main (String[] args){
            EmployeeUc1 emp = new EmployeeUc1();
            emp.EmployeePresentorAbesnt();
        }
    }


