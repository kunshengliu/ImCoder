package jianzhiofffer.string;
/**
 * 字符串的题
 * @author lliukunsheng
 *
 */
public class Main {
	
	
	/**
	 * 对于两个字符串A和B，如果A和B中出现的字符种类相同且每种字符出现的次数相同，则A和B互为变形词，请设计一个高效算法，检查两给定串是否互为变形词。
	 * 给定两个字符串A和B及他们的长度，请返回一个bool值，代表他们是否互为变形词。
	 * 测试样例：
	 * "abc",3,"bca",3
	 * 返回：true
	 * @param A
	 * @param lena
	 * @param B
	 * @param lenb
	 * @return
	 */
    public boolean chkTransform(String A, int lena, String B, int lenb) {
    	char [] c1 = A.toCharArray();
    	char [] c2 = B.toCharArray();
    	if(c1.length!=c2.length) {
    		return false;
    	}
    	
    	int [] ns = new int[256];
    	for(int i=0;i<c1.length;i++) {
    		ns[c1[i]]++;
    	}
    	for(int i=0;i<c2.length;i++) {
    		ns[c2[i]]--;
    		if(ns[c2[i]]<0) {
    			return false;
    		}
    	}    	
    	return true;    	    	
    }
    
    /**
     * 如果对于一个字符串A，将A的前面任意一部分挪到后边去形成的字符串称为A的旋转词。比如A="12345",A的旋转词有"12345","23451","34512","45123"和"51234"。对于两个字符串A和B，请判断A和B是否互为旋转词。
     * 给定两个字符串A和B及他们的长度lena，lenb，请返回一个bool值，代表他们是否互为旋转词。
     * 测试样例：
     * "cdab",4,"abcd",4
     * 返回：true
     */
    public boolean chkRotation(String A, int lena, String B, int lenb) {
    	if(lena!=lenb) {
    		return false;
    	}
    	String bigString =A+A;
    	for(int i=0;i<lena;i++) {
    		String temp =bigString.substring(i, lena+i);
    		if(temp.equals(B)) {
    			return true;
    		}
    	}
    	return false;
    }
    
    /**
     * 对于一个字符串，请设计一个算法，只在字符串的单词间做逆序调整，也就是说，字符串由一些由空格分隔的部分组成，你需要将这些部分逆序。
     * 给定一个原字符串A和他的长度，请返回逆序后的字符串。
     * 测试样例：
     * "dog loves pig",13
     * 返回："pig loves dog"
     */
    public String reverseSentence(String A, int n) {
    	String [] strs = A.split(" ");
    	int len = strs.length;
    	for(int i=0;i<len/2;i++) {
    		String temp =strs[i];
    		strs[i] = strs[len-1-i];
    		strs[len-1-i]=temp;
    		}
    	StringBuilder s = new StringBuilder();
    	for(int i=0;i<strs.length;i++) {
    		s.append(strs[i]);
    		s.append(" ");
    	}
    	String ss=s.substring(0,s.length()-1);
    	return ss;
    }
    
    
    
    
}
