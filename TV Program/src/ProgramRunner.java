import java.util.ArrayList;
public class ProgramRunner
	{
		static ArrayList<Program> tvShows = new ArrayList<Program>( );
		public static void main(String[] args)
		{
			
			tvShows.add(new Program("Brooklyn Nine-Nine", "Comedy", 8));
			tvShows.add(new Program("The Office", "Comedy", 9));
			tvShows.add(new Program("Suits", "Legal Drama", 9));
			tvShows.add(new Program("Scorpion", "Drama", 4));
			tvShows.add(new Program("Marvel Agents of Shield", "Action", 7));
			printList();
			addNumberOfSeasons();
			printList();
			deleteLongestShow();
			printList();
			changeTitle();
			printList();
			
		
			
		}
		public static void printList()
		{
			System.out.println();
			System.out.println();
			System.out.println("The Shows Are!");
			for(int i = 0; i < tvShows.size(); i++)
				{
					System.out.println(tvShows.get(i).getTitle());
					
					System.out.println(tvShows.get(i).getGenre());
					System.out.println(tvShows.get(i).getNumberOfSeasonsAired());
					System.out.println();
				}
			
			
			
		}
		public static void addNumberOfSeasons()
		{
			for(int i = 0; i < tvShows.size(); i++)
				{
			tvShows.get(i).setNumberOfSeasonsAired(tvShows.get(i).getNumberOfSeasonsAired()+ 1);
				}
		}
		public static void deleteLongestShow()
		{
			int showCharLength = tvShows.get(0).getTitle().length();
			int indexOfShowCharLength = 0;
			for(int i = 0; i < tvShows.size(); i++)
				{
					
					if(showCharLength < tvShows.get(i).getTitle().length())
						{
							indexOfShowCharLength = i;
							showCharLength = tvShows.get(i).getTitle().length();
						}
				}
			tvShows.remove(indexOfShowCharLength);
		}
		public static void changeTitle()
		{
			tvShows.get(0).setTitle("The Flash");
		}
	}
