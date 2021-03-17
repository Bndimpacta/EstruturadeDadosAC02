package Ex_02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class pilha {
	static final ArrayStack<String> a = new ArrayStack<String>(3);
	@Test
	void test() {
		a.push("Gol");
		assertEquals("[Gol]", a.toString(), "Deve imprimir [Gol]");
		a.push("Fox");
		assertEquals("[Gol, Fox]", a.toString(), "Deve imprimir [Gol, Fox]");
		a.push("Celta");
		assertEquals("[Gol, Fox, Celta]", a.toString(), "Deve imprimir [Gol, Fox, Celta]");
		
		Assertions.assertThrows(FullStackException.class, () -> { a.push("Logan"); });
		
		assertEquals("Celta", a.pop(), "Deve ter desempilhado Celta");
		assertEquals("[Gol, Fox]", a.toString(), "Deve imprimir [Gol, Fox]");
		assertEquals("Fox", a.pop(), "Deve ter desempilhado Fox");
		assertEquals("[Gol]", a.toString(), "Deve imprimir [Gol]");
		assertEquals("Gol", a.pop(), "Deve ter desempilhado Gol");
		assertEquals("[]", a.toString(), "Deve imprimir []");
			
		assertTrue(a.isEmpty());
		
		Assertions.assertThrows(EmptyStackException.class, () -> { a.pop(); });
	}
}


