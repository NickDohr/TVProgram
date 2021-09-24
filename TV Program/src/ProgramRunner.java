import java.util.ArrayList;
public class ProgramRunner
	{
		static int showCharLength = 0;
		static int indexOfShowCharLength = 0;
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
			tvShows.get(3).setNumberOfSeasonsAired(tvShows.get(3).getNumberOfSeasonsAired()+ 1);
		}
		public static void deleteLongestShow()
		{
			for(int i = 0; i < tvShows.size(); i++)
				{
					showCharLength = tvShows.get(i).getTitle().length();
					if(showCharLength < tvShows.get(i).getTitle().length())
						{
							showCharLength = tvShows.get(i).getTitle().length();
							indexOfShowCharLength = i;
						}
				}
			tvShows.remove(indexOfShowCharLength);
		}
		public static void changeTitle()
		{
			tvShows.get(0).setTitle("The Flash");
		}
	}
