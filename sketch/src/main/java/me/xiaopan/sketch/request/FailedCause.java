/*
 * Copyright (C) 2013 Peng fei Pan <sky@xiaopan.me>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.xiaopan.sketch.request;

/**
 * 失败原因
 */
public enum FailedCause {
    /**
     * URI为NULL或空
     */
    URI_NULL_OR_EMPTY,

    /**
     * URI不支持
     */
    URI_NO_SUPPORT,

    /**
     * 下载失败
     */
    DOWNLOAD_FAIL,

    /**
     * 解码失败
     */
    DECODE_FAIL,

    /**
     * 没有获取到特殊本地图片的缓存文件
     */
    NOT_GET_SPECIFIC_LOCAL_IMAGE_CACHE_FILE,
}