public class Season{
	public static void main(String[] args){
		System.out.println("ener a number between 0 to 12");
		int season_number = new import.java.util.Scanner(System.in).scanInt();
		if(season_number==12 || season_number==1 || season_number==2)
		{
			System.out.println("WINTER");
		}
		else if(season_number==5 || season_number==4 || season_number==3)
		{
			System.out.println("SPRING");
		}
		else if(season_number==6|| season_number==7 || season_number==8)
		{
			System.out.println("SUMMER");
		}
		else
		{
			System.out.println("AUTUMN");
		}
	}
}