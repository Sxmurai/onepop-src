// 
// Decompiled by Procyon v0.6-prerelease
// 

package org.spongepowered.asm.mixin.transformer.throwables;

public class MixinTransformerError extends Error
{
    private static final long serialVersionUID = 1L;
    
    public MixinTransformerError(final String message) {
        super(message);
    }
    
    public MixinTransformerError(final Throwable cause) {
        super(cause);
    }
    
    public MixinTransformerError(final String message, final Throwable cause) {
        super(message, cause);
    }
}
