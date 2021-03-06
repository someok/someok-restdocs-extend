# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/en/1.0.0/)
and this project adheres to [Semantic Versioning](http://semver.org/spec/v2.0.0.html).

## [Unreleased]

## [1.0.15] - 2018-02-08
### Added
- 增加 http status 列表展示 snippet

## [1.0.14] - 2017-12-05
### Changed
- 修正 section snippet，在自定义的两个 include snippet 前面加上 someok 前缀
 
## [1.0.13] - 2017-12-05
### Added
- 增加三个 snippet

## [1.0.10] - 2017-11-23
### Changed
- 测试 bintrayUpload 到 jcenter 并同步到 mvnrepository

## [1.0.8] - 2017-11-23
### Added
- 启用 jcenter 上传后同步到 mvnrepository 机制

## [1.0.7] - 2017-11-23
### Added
- 增加 gpg 签名

## [1.0.6] - 2017-11-23
### Changed
- 修改 `build.gradle` 依赖为 `compile`，因为打包工具不支持 `api`

## [1.0.5] - 2017-11-23
### Added
- 增加 spring-restdocs-mockmvc 依赖，以便调用方可以少配置一条记录

## [1.0.4] - 2017-11-23
### Fixed
- 修正 `CHANGELOG.md` 下面 link 的初始值为 `1.0.2`

## [1.0.3] - 2017-11-23
### Added
- 添加 `CHANGELOG.md` 文件，用于记录 `release notes`

## [1.0.2] - 2017-11-23
### Added
- 增加上传到 jcenter、mvnrepository 配置


[Unreleased]: https://github.com/someok/someok-restdocs-extend/compare/v1.0.15...HEAD
[1.0.15]: https://github.com/someok/someok-restdocs-extend/compare/v1.0.14...v1.0.15
[1.0.14]: https://github.com/someok/someok-restdocs-extend/compare/v1.0.13...v1.0.14
[1.0.13]: https://github.com/someok/someok-restdocs-extend/compare/v1.0.10...v1.0.13
[1.0.10]: https://github.com/someok/someok-restdocs-extend/compare/v1.0.8...v1.0.10
[1.0.8]: https://github.com/someok/someok-restdocs-extend/compare/v1.0.7...v1.0.8
[1.0.7]: https://github.com/someok/someok-restdocs-extend/compare/v1.0.6...v1.0.7
[1.0.6]: https://github.com/someok/someok-restdocs-extend/compare/v1.0.5...v1.0.6
[1.0.5]: https://github.com/someok/someok-restdocs-extend/compare/v1.0.4...v1.0.5
[1.0.4]: https://github.com/someok/someok-restdocs-extend/compare/v1.0.3...v1.0.4
[1.0.3]: https://github.com/someok/someok-restdocs-extend/compare/v1.0.2...v1.0.3
