/*
 Copyright 2006-2011 Abdulla Abdurakhmanov (abdulla@latestbit.com)
 Original sources are available at www.latestbit.com

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package test.org.bn.coders.ber;

import org.bn.CoderFactory;
import org.bn.IDecoder;

import org.bn.IEncoder;

import test.org.bn.coders.CoderTestUtilities;
import test.org.bn.coders.DecoderTest;

public class BERDecoderTest extends DecoderTest {
    protected CoderFactory coderFactory = new CoderFactory();


    public BERDecoderTest(String sTestName) {
        super(sTestName, new BERCoderTestUtils());
    }   
    
    public BERDecoderTest(String sTestName, CoderTestUtilities coderUtils) {
        super(sTestName, coderUtils);
    }
    
    
    protected IDecoder newDecoder() throws Exception {
        return coderFactory.newDecoder("BER");
    }    
}
