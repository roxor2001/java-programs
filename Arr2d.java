class Arr2d
{
public static void main(String args[])
{
  int a[][]= new int[2][2];
  int b[][]= new int[2][2];
  int c[][]= new int[2][2];
  int i,j,k=0;
  while(k<4)
{
  for(i=0;i<2;i++)
  {
    for(j=0;j<2;j++)
    {
      a[i][i]=Integer.parseInt(args[k]);
      k++;
    }
  }
}
  while(k<8)
{
  for(i=0;i<2;i++)
  {
    for(j=0;j<2;j++)
    {
      b[i][i]=Integer.parseInt(args[k]);
       k++;
    }
  }
}
  for(i=0;i<2;i++)
  {
    for(j=0;j<2;j++)
    {
      c[i][j]=0;
      for(k=0;k<2;k++)
       {
         c[i][j]=c[i][j]+a[i][k]*b[k][j];
       }
    }
  }
  for(i=0;i<2;i++)
  {
    for(j=0;j<2;j++)
    {
      System.out.println(c[i][j]);
    }
  }

}
}
