import java.io.*;

public class ComparingStrings {

	public static final String KEY = "hoge";

	static void fuga(){ System.out.println("fuga called!"); }

	public static void main(String[] args) {
		//例としてファイルからBufferedReaderを使って読み込む方法	
		try{
			File file = new File("hoge.txt");	//ファイル名、PATHも指定可能
			FileReader fr = new FileReader(file);
			BufferedReader bf = new BufferedReader(fr);

			String str;
			while ((str = bf.readLine()) != null) {	//reallineで１行ごとに文字列を抽出
				if (str.equals(KEY)) {				//文字列の比較はequalsメソッドで判定
					fuga();
				}
			}

			bf.close();
		} catch (FileNotFoundException e){
			System.out.println("hoge.txt is not found!");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}