/*
 * Copyright (C) 2021-2021 Huawei Technologies Co., Ltd. All rights reserved.
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

package com.huawei.test.configelement.service;

/**
 * 功能描述：计数服务接口
 *
 * @author zl
 * @since 2021-12-16
 */
public interface IGrinderCountService {
	/**
	 * 获取当前线程下一个取数
	 *
	 * @param executeTimesInfo 当前线程执行信息
	 * @return 当前线程的下一个取数
	 */
	int nextIncrementNumber(ExecuteTimesInfo executeTimesInfo);
}
