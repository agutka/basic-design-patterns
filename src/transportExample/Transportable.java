package transportExample;

import transportExample.visitor.TransportVisitor;

public interface Transportable {

    void accept(TransportVisitor transportVisitor);
}
