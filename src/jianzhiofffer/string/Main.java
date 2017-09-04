package jianzhiofffer.string;
/**
 * �ַ�������
 * @author lliukunsheng
 *
 */
public class Main {
	
	
	/**
	 * ���������ַ���A��B�����A��B�г��ֵ��ַ�������ͬ��ÿ���ַ����ֵĴ�����ͬ����A��B��Ϊ���δʣ������һ����Ч�㷨��������������Ƿ�Ϊ���δʡ�
	 * ���������ַ���A��B�����ǵĳ��ȣ��뷵��һ��boolֵ�����������Ƿ�Ϊ���δʡ�
	 * ����������
	 * "abc",3,"bca",3
	 * ���أ�true
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
     * �������һ���ַ���A����A��ǰ������һ����Ų�����ȥ�γɵ��ַ�����ΪA����ת�ʡ�����A="12345",A����ת����"12345","23451","34512","45123"��"51234"�����������ַ���A��B�����ж�A��B�Ƿ�Ϊ��ת�ʡ�
     * ���������ַ���A��B�����ǵĳ���lena��lenb���뷵��һ��boolֵ�����������Ƿ�Ϊ��ת�ʡ�
     * ����������
     * "cdab",4,"abcd",4
     * ���أ�true
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
     * ����һ���ַ����������һ���㷨��ֻ���ַ����ĵ��ʼ������������Ҳ����˵���ַ�����һЩ�ɿո�ָ��Ĳ�����ɣ�����Ҫ����Щ��������
     * ����һ��ԭ�ַ���A�����ĳ��ȣ��뷵���������ַ�����
     * ����������
     * "dog loves pig",13
     * ���أ�"pig loves dog"
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
