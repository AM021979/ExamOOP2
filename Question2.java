public class Question2{
	public static void main(String[] args){
		txtCopy("Source.txt", "Dest.txt");
		editFile("Dest.txt");
		updateFile("Dest.txt");
	}
}

public static void editFile(String a,String b) {
	FileReader fr;
	FileWriter fw;
	BufferedReader bf;
	String data ="";
		
	try{
		fr = new FileReader(a);
		bf = new BufferedReader(fr); 
		fw = new FileWriter(b);
		while((data=bf.readLine())!=null) {
			if(data.equals(a)){
			data="";
				else(data.equals(e)){
				data="";
					else(data.equals(i)){
					data="";
						else(data.equals(o)){
						data="";
							else(data.equals(u)){
							data="";
							}
						}
					}
				}
			}
			fw.write(data);
		}
			fr.close();
			fw.close();
		} catch(IOException e) {
			System.out.println(e);
		}
		
}