package gnu.trove.map.hash;

import gnu.trove.strategy.HashingStrategy;

import java.io.Serializable;
import java.util.Arrays;

public class ArrayHashingStrategy implements HashingStrategy<char[]>, Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public int computeHashCode( char[] o ) {
		return Arrays.hashCode( o );
	}

	@Override
	public boolean equals( char[] o1, char[] o2 ) {
		return Arrays.equals( o1, o2 );
	}

}
