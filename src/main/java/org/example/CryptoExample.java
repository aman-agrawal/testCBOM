package org.example;

import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.BlockCipher;

public class CryptoExample {
    public static void main(String[] args) {
        BlockCipher engine = new AESEngine();
        GCMBlockCipher cipher = new GCMBlockCipher(engine);  // This would be detected
    }
}