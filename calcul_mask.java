
public class calcul_mask
{

public static  void calcul_nb_host(String ch)
{
String  mask=ch;
 String tab[]=mask.split("[.]");
int  tab_int[]=new int[4];
for(int  i=0;i<4;i++)
{
tab_int[i]= Integer.parseInt(tab[i]);
}
int nb_host=1;
int  tab_in[]={0,128,192,224,240,248,252,254};



for(int i=0;i<4;i++)

for(int j=0;j<8;j++)

if(tab_int[i]==tab_in[j])
{



nb_host=((256-tab_in[j])*(int)Math.pow(256,(double)(3-i)));

System.out.println("nb_host    "+nb_host);
i=4;
}





}

public static void main(String []args)
{
try{
calcul_nb_host("255.255.248.0");
}
catch(Exception e)
{}
}












}
