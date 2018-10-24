package s03_DTO.류성곤_최재훈.slot;

public class Slot {
	   private String idNo;
	   private String name;
	   private String pw;
	   private int coin;
	   
	   public Slot(String idNo, String pw, String name, int coin) {
	      this.idNo = idNo;
	      this.pw = pw;
	      this.name = name;
	      this.coin = coin;
	   }
	   
	   public String getIdNo() {
	      return idNo;
	   }
	   public void setIdNo(String idNo) {
	      this.idNo = idNo;
	   }
	   public String getName() {
	      return name;
	   }
	   public void setName(String name) {
	      this.name = name;
	   }
	   public String getPw() {
	      return pw;
	   }
	   public void setPw(String pw) {
	      this.pw = pw;
	   }
	   
	   public int getcoin() {
	      return coin;
	   }
	   public void setcoin(int coin) {
	      this.coin = coin;
	   }
	   
	   
	   
	   @Override
	   public String toString() {
	      return "\nid:"+idNo+"\npw:"+pw+"\nname:"+name+"\ncoin:"+coin;
	   }
}