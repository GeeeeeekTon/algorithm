package ansj.sun.bloomFilter.iface;

public interface Filter {

	/**
	 * @param str
	 * @return �ж�һ���ַ����Ƿ�bitMap�д���
	 */
	public boolean contains(String str);

	/**
	 * @param str ��boolean��bitMap������һ���ַ���
	 */
	public void add(String str);
	
	/**
	 * @param str ��Ҫ���Ӳ��Ҳ�ѯ�ķ���
	 * @return ������ھͷ���true .���������.����������ַ���.�ٷ���false
	 */
	public boolean containsAndAdd(String str) ;
	
	/**
	 * @param chars ����char����
	 * @return 
	 */
	public long myHashCode(String str) ;

}
