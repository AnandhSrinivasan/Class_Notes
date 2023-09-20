/*
 * package access_Modifier;
 * 
 * public class Protected {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * Protected
 * 
 * 
 * package basics;
 * 
 * public class ProtectedA1 {
 * 
 * protected void msg() { System.out.println("Protected method"); }
 * 
 * }
 * 
 * =================== ================== =====================================
 * =================
 * 
 * package basics;
 * 
 * public class ProtectedEx {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * ProtectedA1 obj = new ProtectedA1(); obj.msg();
 * 
 * }
 * 
 * }
 ******************************* 
 * ***************************==************************************************
 * *****
 * 
 * package intermediate;
 * 
 * import basics.ProtectedA1;
 * 
 * public class ProtectedInDiffPkg extends ProtectedA1 {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * ProtectedInDiffPkg obj = new ProtectedInDiffPkg(); obj.msg();
 * 
 * }
 * 
 * }
 * 
 * 
 * }
 * 
 * }
 */