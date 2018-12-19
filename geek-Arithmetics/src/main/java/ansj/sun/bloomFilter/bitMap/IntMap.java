package ansj.sun.bloomFilter.bitMap;

import ansj.sun.bloomFilter.iface.BitMap;


/**
 * 
 * ������BitMap��32λ������.������ܷ������õ�Ч��.һ������½���ʹ�ô���
 */
public class IntMap implements BitMap{

	private static final int MAX = Integer.MAX_VALUE;

	public IntMap() {
		ints = new int[93750000];
	}

	public IntMap(int size) {
		ints = new int[size];
	}

	private int[] ints = null;

	public void add(long i) {
		int r = (int) (i / 32);
		int c = (int) (i % 32);
		ints[r] = (int) (ints[r] | (1 << c));
	}

	public boolean contains(long i) {
		int r = (int) (i / 32);
		int c = (int) (i % 32);
		if (((int) ((ints[r] >>> c)) & 1) == 1) {
			return true;
		}
		return false;
	}

	public void remove(long i) {
		int r = (int) (i / 32);
		int c = (int) (i % 32);
		ints[r] = (int) (ints[r] & (((1 << (c + 1)) - 1) ^ MAX));
	}

}
