/*
 * Copyright 2017 John Hogan.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jogan.kotlinplayground.injection.module

import android.arch.lifecycle.ViewModelProvider
import com.jogan.kotlinplayground.injection.ViewModelFactory
import dagger.Binds
import dagger.Module

/**
 * See https://medium.com/@alexfacciorusso/understanding-dagger-2-multibindings-viewmodel-8418eb372848
 * for better understanding into this implementation
 */
@Module
internal abstract class ViewModelBuilder {
    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}