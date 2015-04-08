import java.util.ArrayList;
import java.util.List;


public class Data {

	private String[] data = new String[]{
			"A brilliant, festive study of JS Bach uses literature and painting to illuminate his 'dance-impregnated' music, writes Peter Conrad",
			"Fatima Bhutto on Malala Yousafzai's fearless and still-controversial memoir",
			"Grisham's sequel to A Time to Kill is a solid courtroom drama about racial prejudice marred by a flawless white hero, writes John O'Connell",
			"This strange repackaging of bits and pieces does the Man Booker winner no favours, says Sam Leith",
			"Another book with music related content"
	};

	public String[] get(String key) {

		List<String> listResult = new ArrayList<String>();

		for(String line: this.data){
			if(line.contains(key)) {
				listResult.add(line);
			}
		}

		String[] result = new String[listResult.size()];
		result = listResult.toArray(result);

		return result;
	}
}
