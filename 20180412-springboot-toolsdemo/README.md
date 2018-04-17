> 创建时间：
- 20180403

> 项目说明：
- 1.spring-boot-devtools：devtools可以实现页面热部署（即页面修改后会立即生效，这个可以直接在application.properties文件中配置spring.thymeleaf.cache=false来实现），      
                                    实现类文件热部署（类文件修改后不会立即生效），实现对属性文件的热部署。   
                                    即devtools会监听classpath下的文件变动，并且会立即重启应用（发生在保存时机），注意：因为其采用的虚拟机机制，该项重启是很快的 
- 2.lombok：能方便的进行get和set,主要注解如下：
            @Getter and @Setter
            @ToString
            @EqualsAndHashCode
            @AllArgsConstructor, @RequiredArgsConstructor and @NoArgsConstructor
            @Log, @Log4j, @Log4j2, @Slf4j, @XSlf4j, @CommonsLog, @JBossLog
            @Data
            @Builder
            @Singular
            @Delegate
            @Value
            @Accessors
            @Wither
            @SneakyThrows
