/*
 * Copyright (C) 2023 BackgroundOpt
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.venus.backgroundopt.utils

/**
 * HyperOS 4 适配期的文件日志，现已停用。
 *
 * 原用途：本机 logd 异常("Logd maybe crashed")时，把关键错误写入
 * /data/system/bglog/module.log 便于排查 hook 注册失败与运行期异常。
 *
 * 现已清空方法体（不再写文件），但保留类与方法签名，
 * 避免所有调用点（RunningInfo/HookPoint/IHook/AndroidHookHandler/ProcessListHookKt 等）
 * 报 NoClassDefFoundError / NoSuchMethodError。
 */
object BgDebugLog {
    @JvmStatic
    fun log(msg: String) {
    }

    @JvmStatic
    fun log(msg: String, t: Throwable) {
    }
}
