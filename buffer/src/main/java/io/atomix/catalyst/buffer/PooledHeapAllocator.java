/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.atomix.catalyst.buffer;

import io.atomix.catalyst.buffer.util.HeapMemory;
import io.atomix.catalyst.util.reference.ReferencePool;

/**
 * Pooled heap buffer allocator.
 *
 * @author <a href="http://github.com/kuujo">Jordan Halterman</a>
 */
public class PooledHeapAllocator extends PooledAllocator {

  @SuppressWarnings({ "unchecked", "rawtypes" })
  public PooledHeapAllocator() {
    super((ReferencePool) new HeapBufferPool());
  }

  @Override
  protected long maxCapacity() {
    return HeapMemory.MAX_SIZE;
  }

}
