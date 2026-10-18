# shortlink

SaaS 短链接系统（开发中）。Spring Boot + MyBatis-Plus + MySQL，后续接入 Redis、网关与访问统计。

## 模块

| 模块 | 端口 | 状态 |
| --- | --- | --- |
| admin | 8002 | 已搭建骨架，完成按用户名查询用户接口 |
| project | 8001 | 待开发（短链接生成 / 跳转 / 统计） |
| gateway | 8000 | 待开发 |

## 本地运行

1. 建库 `link`，并创建用户表（`UserDO` 对应的表）。
2. 复制 `admin/src/main/resources/application.yaml.template` 为 `application.yaml`，填入本地 MySQL 密码（该文件已被 `.gitignore` 忽略）。
3. 启动 `ShortLinkAdminApplication`，访问 `GET /api/shortlink/v1/user/{username}`。
