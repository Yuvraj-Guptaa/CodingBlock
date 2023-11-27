package patternspractice;

public class p1 {
    public static void patter1(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void pattern2(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void pattern3lakshaybhaiya(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i + 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

    }

    public static void pattern3(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i + 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

    }

    public static void pattern4(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= i) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }

    }

    public static void pattern5(int n) {
        int i = 1;
        while (i <= n) {
            int k = 2;
            while (k <= i) {
                System.out.print(" ");
                k++;
            }
            int j = 1;
            while (j <= n - i + 1) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }

    }

    public static void pattern6(int n) {
        int i = 1;
        while (i <= n) {
            int k = 2;
            while (k <= i) {
                System.out.print("  ");
                k++;
            }
            int j = 1;
            while (j <= n - i + 1) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }

    }

    public static void pattern7(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                if (j == 1 || i == 1 || j == n || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }

    }

    public static void pattern8(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                if (j == i || (i + j) == n + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }

    }

    public static void pattern9(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= i) {
                System.out.print("*");
                k++;
            }
            int l = 2;
            while (l <= i) {
                System.out.print("*");
                l++;
            }
            System.out.println();
            i++;
        }

    }

    public static void pattern9lakshay(int n) {
        int i = 1;
        int o = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
            int k = 1;

            while (k <= o) {
                System.out.print("*");
                k++;
            }
            o = o + 2;

            System.out.println();
            i++;
        }

    }

    public static void pattern10(int n) {
        int i = 5;
        while (n >= i && i > 0) {
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= i) {
                System.out.print("*");
                k++;
            }
            int l = 2;
            while (l <= i) {
                System.out.print("*");
                l++;
            }
            System.out.println();
            i--;
        }

    }

    public static void pattern11lakshay(int n) {
        int i = 1;
        int o = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
            int k = 1;

            while (k <= o) {
                if (k % 2 != 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                k++;
            }
            o = o + 2;

            System.out.println();
            i++;
        }

    }

    public static void pattern12lakshay(int n) {
        int i = 1;
        int o = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
            int k = 1;

            while (k <= o) {
                if (k % 2 != 0) {
                    System.out.print("*");
                } else {
                    System.out.print("!");
                }
                k++;
            }
            o = o + 2;

            System.out.println();
            i++;
        }

    }

    public static void pattern13lakshay(int n) {
        int i = 1;
        int totalstr = 1;
        while (i <= 2 * n - 1) {
            int j = 1;
            while (j <= totalstr) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
            if (i <= n) {
                totalstr++;
            } else {
                totalstr--;
            }
        }

    }

    public static void pattern14lakshay(int n) {
        int i = 1;
        int totalstr = 1;
        int totalspaces = n - 1;
        while (i <= 2 * n - 1) {
            int k = 1;
            while (k <= totalspaces) {
                System.out.print(" ");
                k++;
            }
            int j = 1;
            while (j <= totalstr) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
            if (i <= n) {
                totalstr++;
                totalspaces--;
            } else {
                totalstr--;
                totalspaces++;
            }
        }

    }

    public static void pattern15lakshay(int n) {
        int row = 1;
        int totalstr = n;
        int totalspaces = 0;
        while (row <= 2 * n - 1) {
            int countspaces = 1;
            while (countspaces <= totalspaces) {
                System.out.print("  ");
                countspaces++;
            }
            int countstars = 1;
            while (countstars <= totalstr) {
                System.out.print("* ");
                countstars++;
            }
            System.out.println();
            row++;
            if (row <= n) {
                totalstr--;
                totalspaces += 2;
            } else {
                totalstr++;
                totalspaces -= 2;
            }

        }

    }

    public static void pattern16(int n) {
        int row = 1;
        int totalstr = n;
        int totalspaces = n - 1;
        while (row <= 2 * n - 1) {
            int countspaces = 1;
            while (countspaces <= totalspaces) {
                System.out.print("  ");
                countspaces++;
            }
            int countstars = 1;
            while (countstars <= totalstr) {
                System.out.print("* ");
                countstars++;
            }
            System.out.println();
            row++;
            if (row <= n) {
                totalspaces--;
                totalstr--;
            } else {
                totalspaces++;
                totalstr++;

            }
        }
    }

    public static void pattern17(int n) {
        int row = 1;
        int totalspaces = 2;
        int totalstars1 = 3;
        int totalstars2 = 3;
        while (row <= n) {
            int countstars1 = 1;
            while (countstars1 <= totalstars1) {
                System.out.print("* ");
                countstars1++;
            }
            int countspaces = 1;
            while (countspaces <= totalspaces) {
                System.out.print("  ");
                countspaces++;
            }
            int countstars2 = 1;
            while (countstars2 <= totalstars2) {
                System.out.print("* ");
                countstars2++;
            }
            System.out.println();
            row++;
            if (row <= 4) {
                totalstars1--;
                totalstars2--;
                totalspaces += 2;
            } else {
                totalstars1++;
                totalstars2++;
                totalspaces -= 2;
            }

        }
    }

    public static void pattern18(int n) {
        int row = 1;
        int totalspaces = n - 1;
        int totalstars1 = 0;
        while (row <= n) {
            int countspaces = 1;
            while (countspaces <= totalspaces) {
                System.out.print(" ");
                countspaces++;
            }
            int countstars1 = 1;
            while (countstars1 <= 2 * totalstars1 + 1) {
                System.out.print("*");
                countstars1++;
            }
            System.out.println();
            row++;
            if (row <= 4) {
                totalspaces--;
                totalstars1++;
            } else {
                totalspaces++;
                totalstars1--;

            }
        }
    }

    public static void pattern19(int n) {

        int row = 1;
        int totalspaces = 0;
        int totalstars1 = 4;
        int totalstars2 = 3;
        while (row <= n) {
            int countstars1 = 1;
            while (countstars1 <= totalstars1) {
                System.out.print("*");
                countstars1++;
            }

            int countspaces = 1;
            while (countspaces <= totalspaces) {
                System.out.print(" ");
                countspaces++;
            }
            if (row < 4) {
                if (totalspaces == 0) {
                    totalspaces += 1;
                } else {
                    totalspaces += 2;

                }
            } else {
                if (totalspaces == 0) {
                    totalspaces -= 1;
                } else {
                    totalspaces -= 2;

                }

            }
            int countstars2 = 1;
            if (row == 2 || row == 7) {
                countstars2 = 1;
                totalstars2 = 3;
            }

            while (countstars2 <= totalstars2) {
                System.out.print("*");
                countstars2++;
            }

            System.out.println();
            row++;
            if (row <= 4) {
                totalstars1 = totalstars1 - 1;
                totalstars2 = totalstars2 - 1;
            } else {
                totalstars1 = totalstars1 + 1;
                totalstars2 = totalstars2 + 1;

            }

        }
    }

    public static void pattern20(int n) {
        int row = 1;
        int totalfspaces = 3;
        int totalspaces = 0;
        int totalstars1 = 1;
        int totalstars2 = 0;

        while (row <= n) {
            int firstspaces = 1;

            while (firstspaces <= totalfspaces) {
                System.out.print(" ");
                firstspaces++;
            }

            int countstars1 = 1;
            int countspaces = 1;
            while (countstars1 <= totalstars1) {
                System.out.print("*");
                countstars1++;
            }

            while (countspaces <= totalspaces) {
                System.out.print(" ");
                countspaces++;
            }
            int countstars2 = 1;

            while (countstars2 <= totalstars2) {
                System.out.print("*");
                countstars2++;
            }
            row++;

            if (row == 2) {
                totalspaces++;
                totalfspaces--;
                totalstars2++;
            } else if (row <= 4) {
                totalspaces += 2;

                totalfspaces--;
            } else if (row == n) {
                totalspaces--;
                totalstars2--;
                totalfspaces++;
            } else {
                totalspaces -= 2;
                totalfspaces++;
            }

            System.out.println();

        }

    }
    public static void pattern21(int n)
    {
        int row=1;
        int totalstars1=1;
        int totalspaces=7;
        int totalstars2=1;
        while(row<=n)
        {
           int countstars1=1;
           while(countstars1<=totalstars1)
           {
            System.out.print("*");
            countstars1++;
           }
           int countspaces=1;
           while(countspaces<=totalspaces)
           {
            System.out.print(" ");
            countspaces++;
           }
           int countstars2=1;
           while(countstars2<=totalstars2)
           {
            System.out.print("*");
            countstars2++;
           }

           System.out.println();
           totalstars1++;
           totalspaces-=2;
           totalstars2++;
           if(row==4||row==5)
           {
            totalspaces=0;
            totalstars2=4;

           }
           row++;
        }
    }
    public static void pattern22(int n)
    {
        int row=1;
        int totalstars1=5;
        int totalstars2=4;
        int totalfspaces=0;
        while(row<=n)
        {
            int countstars1=1;
            while(countstars1<=totalstars1)
            {
                System.out.print("*");
                countstars1++;
            }
            int countspaces=1;
            while(countspaces<=totalfspaces)
            {
                System.out.print(" ");
                countspaces++;
            }
            int countstars2=1;
            while(countstars2<=totalstars2)
            {
                System.out.print("*");
                countstars2++;
            }
            row++;
            totalstars1--;
            totalstars2--;
            totalfspaces+=2;
            if(row==2)
            {
                totalfspaces=1;
                totalstars2=4;
            }
            
            System.out.println();
            

        }
    }

    public static void main(String[] args) {

       pattern22(5);
    }

}
